import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import org.bson.Document;

public class DeleteDoc {
    public static void main(String args[]) {
      
        MongoClient mongo = new MongoClient("localhost", 27017);
        System.out.println("Connected to the database successfully");

        // Accessing the database
        MongoDatabase database = mongo.getDatabase("College");

        // Accessing the collection
        MongoCollection<Document> collection = database.getCollection("teacher");
        System.out.println("Collection teachers selected successfully");

        // Creating a query to specify the document to delete
        Document query = new Document();
        query.append("project_by","Nutan");  // Deleting the document where "id" is 1

        // Deleting the document
        collection.deleteOne(query);
        System.out.println("************ Document deleted successfully **********");
    }
}





// import com.mongodb.client.MongoCollection;
// import com.mongodb.client.MongoDatabase;
// import com.mongodb.MongoClient;
// import org.bson.Document;

// import java.util.Scanner;

// public class DeleteDoc {
//     public static void main(String args[]) {
//         // Creating a Mongo client
//         MongoClient mongo = new MongoClient("localhost", 27017);
//         System.out.println("Connected to the database successfully");

//         // Accessing the database
//         MongoDatabase database = mongo.getDatabase("College");

//         // Accessing the collection
//         MongoCollection<Document> collection = database.getCollection("teacher");
//         System.out.println("Collection teachers selected successfully");

//         // Creating a Scanner object to take input from the user
//         Scanner scanner = new Scanner(System.in);

//         // Asking for 'project_by' input
//         System.out.print("Enter the name of the person (project_by) to delete: ");
//         String projectByInput = scanner.next();

//         // Creating a query to specify the document to delete
//         Document query = new Document();
//         query.append("project_by", projectByInput);  // Deleting the document where "project_by" matches user input

//         // Deleting the document
//         collection.deleteOne(query);
//         System.out.println("************ Document deleted successfully **********");
//     }
// }

