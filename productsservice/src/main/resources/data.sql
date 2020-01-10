insert into productdb.productinfo (name,category,description, price, product_condition, product_status, units_in_stock, manufacturer) values ('iPhone11', 'IPHONE', 'iPhone 11', 1500000, 'NEW', 'IN_STOCK', 10, 'Apple');
insert into productcondition (product_condition) values ('NEW');
insert into productcondition (product_condition) values ('USED_GOOD');
insert into productcondition (product_condition) values ('DAMAGED');
insert into productstatus (product_status) values ('IN_STOCK');
insert into productstatus (product_status) values ('IN_TRANSIT');
insert into productstatus (product_status) values ('DELIVERED');
insert into productstatus (product_status) values ('MISSING');
insert into productstatus (product_status) values ('NO_STOCK');
insert into productstatus (product_status) values ('ORDERED');
insert into productstatus (product_status) values ('WAITING_FOT_STOCK');

insert into productcategory (category) values ('IPHONE');
insert into productcategory (category) values ('MAC_BOOK_PRO');
insert into productcategory (category) values ('MAC_BOOK_AIR');
insert into productcategory (category) values ('MAC_MINI');
insert into productcategory (category) values ('IPAD');
insert into productcategory (category) values ('WATCH');
insert into productcategory (category) values ('APPLE_TV');