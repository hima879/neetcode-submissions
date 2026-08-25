-- Write your query below
SELECT x.customer_id,x.customer_name
from customers x
where x.customer_id in (SELECT y.customer_id from orders y where y.product_name ='A') 
AND x.customer_id IN (SELECT z.customer_id FROM orders z WHERE z.product_name = 'B')
AND x.customer_id NOT IN (SELECT t.customer_id FROM orders t WHERE t.product_name = 'C')
ORDER by x.customer_name;