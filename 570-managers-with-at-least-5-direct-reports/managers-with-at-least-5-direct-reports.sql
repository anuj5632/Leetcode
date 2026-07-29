# Write your MySQL query statement below
select name from Employee where id in (select managerId from Employee Group by managerId having count(managerId) >= 5);