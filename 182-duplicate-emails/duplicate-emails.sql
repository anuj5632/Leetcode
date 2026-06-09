# Write your MySQL query statement below
select email from Person Group By(email) having count(email) > 1;