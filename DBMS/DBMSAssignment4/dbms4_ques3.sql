alter table `order` add index order_table_index (OrderID);

alter table `order` add index order_date_index (Date);

alter table `product` add index product_table_index (ProductID);

alter table `category` add index category_table_index (CategoryID);
