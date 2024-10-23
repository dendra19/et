import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
//import com.mongodb.MongoCredential;
import org.bson.Document;
public class insertingDocument
{
public static void main(String args[])
{
MongoClient mongo=new MongoClient("localhost",27017);
System.out.println("Connected to the database successfully");

MongoDatabase database = mongo.getDatabase("Shivay");

MongoCollection<Document> collection = database.getCollection("Shivm");
System.out.println("Collection sampleCollection1 selected successfully");

Document document = new Document();
document.append("id",2);
document.append("description","Papa Ji Bol");
document.append("likes",1000000);
document.append("url","http://www.Hmmm.com");
document.append("by","Hey My Dear Friends");
document.append("project by","SHivam");

collection.insertOne(document);
System.out.println(document );
System.out.println("Document inserted successfully");
}
}






