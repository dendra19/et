
import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase;

import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;   

import org.bson.Document; 
import java.util.Iterator; 
import com.mongodb.client.FindIterable; 

public class Retrive 
{    
   public static void main( String args[] ) 
   {        
      MongoClient mongo = new MongoClient( "localhost" , 27017 );       
      System.out.println("Connected to the database successfully");  
      
      MongoDatabase database = mongo.getDatabase("College");      
    
      MongoCollection<Document> collection = database.getCollection("teacher");
      System.out.println("******* Collection sampleCollection selected successfully****"); 
      
      FindIterable<Document> iterDoc = collection.find(); 
      int i = 1; 
      
      Iterator it = iterDoc.iterator(); 
    
      while(it.hasNext()) 
	  {  
			System.out.println(it.next());  
			i++; 
      }
      System.out.println("All Done");
   } 
}