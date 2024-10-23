import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import org.bson.Document;
public class InsertDoc {
    public static void main(String args[]) {
        MongoClient mongo = new MongoClient("localhost", 27017);
        System.out.println("Connected to the database successfully");

        MongoDatabase database = mongo.getDatabase("College");

        MongoCollection<Document> collection = database.getCollection("teachers");
        System.out.println("Collection sampleCollection selected successfully");

        Document document = new Document();
        document.append("id", 1);
        document.append("description", "AI");
        document.append("likes", 4000);
        document.append("url", "http://www.artificialIntelligence.com");
        document.append("project_by", "Samira Maam");
        collection.insertOne(document);
        System.out.println("************ Document inserted successfully **********");
    }

}
