-- Write your query below
SELECT s.name
FROM sales_person s
WHERE sales_id NOT IN (
    SELECT sales_id
    from orders
    where com_id = (
        SELECT com_id
        from company 
        where name = 'CRIMSON'
    )
);