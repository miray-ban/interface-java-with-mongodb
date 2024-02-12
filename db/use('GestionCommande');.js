use('GestionCommande');
db.createCollection("clients")
db.createCollection("commandes")
db.createCollection("ligne_commandes")
db.createCollection("articles")
db.clients.insertOne({
     "prenom": "miray",
     "adresse": "hay saada n14 ",
     "telephone": "06060606",
     "code_postal": "1400",
     "methode": {
         "passe_commande": function() {},
         "paie_commande": function(cmd) { }}
     })
     db.commandes.insertOne({
      "num": 12,
      "date": ISODate("2024-04-17"),
      "adresse_livraison": "taza",
      "methode": {
         "calcul_montant": function() { },
         "ajout_article": function() { },
         "pays": function() { },
         "modifier": function() { }
 }})
db.ligne_commandes.insertOne({
    "quantite": 2
 })
 db.articles.insertOne({
    "code": "ART001",
    "designation": "T-shirt",
    "prix_unitaire": 20,
    "rayon": "Vêtements",
    "sous_rayon": "femme"
 })


