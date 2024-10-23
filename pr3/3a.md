a. Write a MongoDB query to use sum, avg, min and max expression.
 
First Create Employee Collection
```js
> db.employee.insertMany([{ "_id": 11,"name": "Alice", "age": 25, "salary":3000 },{ "_id": 12, "name": "Bob", "age": 30, "salary": 4000 },{ "_id": 21, "name": "Charlie", "age": 35, "salary": 5000 },{ "_id": 19, "name": "David", "age": 40, "salary": 6000 },{ "_id": 20, "name": "Eve","age": 45, "salary": 7000 }])
```
1. Sum of Salaries:
```> db.employee.aggregate([ { $group: { _id: null, totalSalary: { $sum: "$salary" } } }] )```
2. Average Age:
```> db.cemployee.aggregate([ { $group: { _id: null, averageAge: { $avg: "$salary" }}}] ) ```
3. Minimum Age:
```> db.employee.aggregate([ { $group: { _id: null, minAge: { $min: "$age" } } }] ) ```
4. Maximum Salary:
```> db.employee.aggregate([ { $group: { _id: null, maxSalary: { $max: "$salary" } } }] )```

