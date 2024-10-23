import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.FindIterable;
import org.bson.Document;

import java.util.Iterator;

public class RetrievingAllDocuments {
    public static void main(String[] args) {
        // Creating a Mongo client using MongoClients factory
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        System.out.println("Connected to the database successfully");

        // Accessing the database
        MongoDatabase database = mongoClient.getDatabase("mydb2");

        // Retrieving a collection
        MongoCollection<Document> collection = database.getCollection("Mycol");
        System.out.println("Collection selected successfully");

        // Fetching all documents from the collection
        FindIterable<Document> iterDoc = collection.find();
        
        // Getting the iterator
        Iterator<Document> iterator = iterDoc.iterator();

        // Iterating through the collection
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toJson());
        }

        // Closing the Mongo client
        mongoClient.close();
    }
}
