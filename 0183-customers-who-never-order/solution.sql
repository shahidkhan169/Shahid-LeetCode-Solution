SELECT t1.name AS Customers from Customers t1 LEFT JOIN Orders t2 ON t1.id=t2.customerId WHERE t2.customerId IS NULL
