<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Créer un Nouveau Membre</title>
</head>
<body>
    <h1>Créer un Nouveau Membre</h1>
    <form action="/add_member" method="POST">
        <!-- Nom -->
        <label for="lastname">Nom :</label>
        <input type="text" id="lastname" name="lastname" maxlength="100" required>
        <br><br>
        
        <!-- Prénom -->
        <label for="firstname">Prénom :</label>
        <input type="text" id="firstname" name="firstname" maxlength="100" required>
        <br><br>
        
        <!-- Email -->
        <label for="mail">Email :</label>
        <input type="email" id="mail" name="mail" maxlength="255" required>
        <br><br>
        
        <!-- Mot de passe -->
        <label for="mdp">Mot de passe :</label>
        <input type="password" id="mdp" name="mdp" required>
        <br><br>
        <!-- Téléphone -->
        <label for="phone">Téléphone :</label>
        <input type="tel" id="phone" name="phone" maxlength="50">
        <br><br>
        
        <!-- Statut -->
        <label for="statut">Statut :</label>
        <select id="statut" name="statut" required>
            <option value="étudiant">Étudiant</option>
            <option value="adulte">Adulte</option>
            <option value="senior">Senior</option>
        </select>
        <br><br>
        
        <!-- Crédit -->
        <label for="credit">Crédit :</label>
        <input type="number" id="credit" name="credit" min="0" required>
        <br><br>
        
        <!-- Bouton d'envoi -->
        <button type="submit">Créer le Membre</button>
    </form>
</body>
</html>