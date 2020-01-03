CREATE TABLE `productdb`.`productinfo` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT  NULL,
  `category` VARCHAR(45) NOT  NULL,
  `description` VARCHAR(45) NOT  NULL,
  `price` INT  NOT NULL,
  `product_condition` ENUM('NEW', 'USED-GOOD', 'DAMAGED') NOT NULL,
  `product_status` ENUM('IN_STOCK', 'IN_TRANSIT', 'DELIVERED', 'MISSING', 'NO_STOCK', 'ORDERED', 'WAITING_FOT_STOCK') NOT NULL,
  `units_in_stock` INT NOT  NULL,
  `manufacturer` VARCHAR(45) NOT  NULL,
  PRIMARY KEY (`id`));