from pymongo import MongoClient
client= MongoClient("localhost",27017)
db=client.mydb2
def insert1():
    try:
        name1=input("Enter your Name :")
        age1=input("enter age")
        db.Mycol.insert_one(
            {
                "name":name1,
                "age":age1

            }
            )
        print("succesfull")
    except Exception:
         print(str("error"))
insert1()
