CREATE DATABASE IF NOT EXISTS charity_system DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE charity_system;
SET NAMES utf8;

-- create user table
CREATE TABLE IF NOT EXISTS `user` (
    `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(32) NOT NULL UNIQUE,
    `password` VARCHAR(32) NOT NULL,
    `role` ENUM('CHARITY', 'SPONSOR', 'ADMIN') DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `user` (`username`, `password`, `role`) VALUES
('test1', 'test1', 'CHARITY'),
('test2', 'test2', 'CHARITY');


-- create charity table
CREATE TABLE IF NOT EXISTS `charity` (
    `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
    `user_id` int(11) unsigned NOT NULL,
    `name` VARCHAR(32) NOT NULL,
    `description` TEXT,
    PRIMARY KEY (`id`),
    CONSTRAINT `fk_charity_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `charity` (`user_id`, `name`, `description`) VALUES
(1, 'Helping Hands', 'We provide support for the homeless.'),
(2, 'hello charity', 'Biggest charity community on earth.');

