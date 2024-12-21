# Write your MySQL query statement below
select product_name,sum(unit) as unit from
Orders o
join 
Products p
on p.product_id=o.product_id
where year(order_date)='2020' and month(order_date)='02'
group by p.product_id
having sum(unit)>=100;
