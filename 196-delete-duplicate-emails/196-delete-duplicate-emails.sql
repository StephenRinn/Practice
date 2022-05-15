# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
DELETE p from Person p, Person j where p.email = j.email and p.id > j.id;