import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient; 
import org.bson.Document; 
import java.util.Iterator; 
import com.mongodb.client.FindIterable;
import com.mongodb.MongoCredential;

public class RetrievingAllDocuments {    
   public static void main(String args[]) {        
      MongoClient mongo = new MongoClient("localhost", 27017);       
      System.out.println("Connected to the database successfully");  
      
      MongoDatabase database = mongo.getDatabase("mydb2");      
      MongoCollection<Document> collection = database.getCollection("Mycol");
      System.out.println("Collection Mycol selected successfully"); 
      
      FindIterable<Document> iterDoc = collection.find(); 
      int i = 1; 
      
      Iterator<Document> it = iterDoc.iterator(); 
    
      while(it.hasNext()) {  
         System.out.println(it.next());  
         i++; 
      }
   } 
}
