
import React, { useState } from 'react';

const MessageSender = () => {
    const [message, setMessage] = useState('');

    const handleSubmit = async (event) => {
        event.preventDefault();


        try {
            const response = await fetch('http://localhost:8080/logMyMessage', {
            //const response = await fetch('/api/logMyMessage', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ message :message}),
            });

            if (response.ok) {
                console.log('Message envoyé avec succès');

            } else {
                console.error('Erreur lors de l\'envoi du message');

            }
        } catch (error) {
            console.error('Erreur inattendue', error);

        }
    };

    return (
        <form onSubmit={handleSubmit}>
            <label>
                Message:
                <input
                    type="text"
                    value={message}
                    onChange={(e) => setMessage(e.target.value)}
                />
            </label>
            <button type="submit">Envoyer</button>
        </form>
    );
};

export default MessageSender;
