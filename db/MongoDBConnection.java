package db;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import models.Client;

public class MongoDBConnection {
    private static final String DATABASE_NAME = "mydatabase";
    private static final String COLLECTION_NAME = "clients";

    public static void saveClient(Client client) {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> clientsCollection = database.getCollection(COLLECTION_NAME);

            Document document = new Document("prenom", client.getPrenom())
                    .append("adresse", client.getAdresse())
                    .append("telephone", client.getTelephone())
                    .append("codePostal", client.getCodePostal());

            clientsCollection.insertOne(document);
            System.out.println("Client ajouté avec succès à la base de données MongoDB.");
        } catch (Exception e) {
            System.err.println("Erreur lors de l'ajout du client dans la base de données MongoDB : " + e.getMessage());
        }
    }
}
