# select p.product_id,ifnull(round(sum(price*units)/sum(units),2),0) as average_price
# from Prices p join UnitsSold u
# on p.product_id = u.product_id
# and purchase_date between start_date and end_date 
# group by p.product_id
SELECT p.product_id, IFNULL(ROUND(SUM(units*price)/SUM(units),2),0) AS average_price
FROM Prices p LEFT JOIN UnitsSold u
ON p.product_id = u.product_id AND
u.purchase_date BETWEEN start_date AND end_date
group by product_id