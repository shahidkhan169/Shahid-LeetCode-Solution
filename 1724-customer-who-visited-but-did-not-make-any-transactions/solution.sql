select a.customer_id , COUNT(a.visit_id) as count_no_trans from Visits as a LEFT JOIN Transactions as b on a.visit_id=b.visit_id where b.transaction_id is NULL group by a.customer_id

