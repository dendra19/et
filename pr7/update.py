from pymongo import MongoClient
client = MongoClient('localhost:27017')
db = client.mydb2
def update():
    try:
        name1 = input("enter name : ")
        age1 = input("enter age to update : ")
        db.Mycol.update_one(
            { "name":name1 },
            {"$set":{"age":age1}}
            )
        print("\n deletion successfully \n")
    except Exception:
        print(str("error"))
update()
