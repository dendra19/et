from pymongo import MongoClient
client = MongoClient('localhost:27017')
db = client.mydb2
def read():
    try:
        col = db.Mycol.find()
        print("\n All data from Database \n")
        for i in col:
            print(i)
    except Exception:
        print(str("error"))

read()
