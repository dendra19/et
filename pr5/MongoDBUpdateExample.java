import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

public class MongoDBUpdateExample {
    public static void main(String[] args) throws UnknownHostException {
        MongoClient mongo = new MongoClient("localhost", 27017); 
        System.out.println("Connected to the database successfully");

        MongoDatabase database = mongo.getDatabase("myDb1"); 

        MongoCollection<Document> collection = database.getCollection("sampleCollection1");
        System.out.println("Collection sampleCollection1 selected successfully");

        collection.deleteOne(Filters.eq("id", 1)); 
        System.out.println("Document deleted successfully...");

    }
}
