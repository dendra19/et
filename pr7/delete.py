from pymongo import MongoClient
client = MongoClient('localhost:27017')
db = client.mydb2
def delete():
    try:
        name1 = input("enter name : ")
        db.Mycol.delete_one(
            { "name":name1 }
            )
        print("\n deletion successfully \n")
    except Exception:
        print(str("error"))

delete()
