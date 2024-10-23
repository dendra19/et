import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public class MongoDBDeleteExample {
    public static void main(String[] args) {
        // Creating a Mongo client
        MongoClient mongo = new MongoClient("localhost", 27017); 
        System.out.println("Connected to the database successfully");

        // Accessing the database
        MongoDatabase database = mongo.getDatabase("myDb1");

        // Accessing the collection
        MongoCollection<Document> collection = database.getCollection("sampleCollection1");
        System.out.println("Collection sampleCollection1 selected successfully");

        // Deleting the document where the id is 1
        collection.deleteOne(Filters.eq("id", 1)); 
        System.out.println("Document deleted successfully...");
    }
}
