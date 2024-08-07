document.addEventListener('DOMContentLoaded', function() {
    fetchMotivations();
});

async function fetchMotivations() {
    try {
        const response = await fetch('/motivations');
        if (!response.ok) {
            throw new Error('Network responde con No OK');
        }
        const motivations = await response.json();
        const tableBody = document.querySelector('#motivationsTable tbody');
        tableBody.innerHTML = '';

        motivations.forEach(motivation => {
            const row = document.createElement('tr');

            // Crea la celda para las motivaciones
            const textCell = document.createElement('td');
            textCell.className = 'motivation-text';
            textCell.textContent = motivation.motivation;

            // Crea la celda para los iconos
            const actionsCell = document.createElement('td');
            actionsCell.className = 'actions';
            actionsCell.innerHTML = `
                <button class="edit-btn" onclick="startEdit(${motivation.id}, '${motivation.motivation}')">
                    <i class="fa-solid fa-pencil"></i>
                </button>
                <button class="delete-btn" onclick="deleteMotivation(${motivation.id})">
                    <i class="fa-solid fa-trash-can"></i>
                </button>
            `;

            row.appendChild(textCell);
            row.appendChild(actionsCell);
            tableBody.appendChild(row);
        });
    } catch (error) {
        console.error('Error al buscar motivaciones:', error);
    }
}

async function addMotivation() {
    const text = document.getElementById('newMotivation').value;
    if (text.trim() === '') {
        alert('La motivación no puede estar vacía');
        return;
    }
    try {
        await fetch('/motivations', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ motivation: text })
        });
        document.getElementById('newMotivation').value = '';
        fetchMotivations(); // Refresca la lista después de añadir una motivación
    } catch (error) {
        console.error('Error añadiendo motivación:', error);
    }
}

async function deleteMotivation(id) {
    try {
        await fetch(`/motivations/${id}`, {
            method: 'DELETE'
        });
        fetchMotivations(); // Refresca la lista después de borrar una motivación
    } catch (error) {
        console.error('Error borrando motivación:', error);
    }
}

function startEdit(id, motivation) {
    document.getElementById('newMotivation').value = motivation;
    editingId = id;
}