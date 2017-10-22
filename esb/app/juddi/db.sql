-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema r41n
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema r41n
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `r41n` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema juddiv3
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema juddiv3
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `juddiv3` DEFAULT CHARACTER SET utf8 ;
USE `r41n` ;

-- -----------------------------------------------------
-- Table `r41n`.`sqlstmt`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `r41n`.`sqlstmt` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `statslogId` BIGINT(20) UNSIGNED NOT NULL,
  `sqlstmt` MEDIUMTEXT NULL DEFAULT NULL,
  UNIQUE INDEX `id` (`id` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 155874
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `r41n`.`statslog`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `r41n`.`statslog` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `userName` VARCHAR(255) NULL DEFAULT NULL,
  `time` VARCHAR(255) NULL DEFAULT NULL,
  `cacheRatio` VARCHAR(255) NULL DEFAULT NULL,
  `date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `req_localObjectsCreated` MEDIUMTEXT NULL DEFAULT NULL,
  `req_mapParam` MEDIUMTEXT NULL DEFAULT NULL,
  `req_url` MEDIUMTEXT NULL DEFAULT NULL,
  `req_user` VARCHAR(255) NULL DEFAULT NULL,
  `requestend` VARCHAR(255) NULL DEFAULT NULL,
  `requestmax` VARCHAR(255) NULL DEFAULT NULL,
  `requeststart` VARCHAR(255) NULL DEFAULT NULL,
  `requesttotal` VARCHAR(255) NULL DEFAULT NULL,
  `requestused` VARCHAR(255) NULL DEFAULT NULL,
  `sqlStmts` INT(11) NULL DEFAULT NULL,
  `sqlTime` INT(11) NULL DEFAULT NULL,
  `systemfinishfree` BIGINT(20) NULL DEFAULT NULL,
  `systemfinishperc` INT(11) NULL DEFAULT NULL,
  `systemfinishrequests` BIGINT(20) NULL DEFAULT NULL,
  `systemfinishused` FLOAT NULL DEFAULT NULL,
  `systemfinishusers` INT(11) NULL DEFAULT NULL,
  `systemstartfree` FLOAT NULL DEFAULT NULL,
  `systemstartperc` INT(11) NULL DEFAULT NULL,
  `systemstartrequests` BIGINT(20) NULL DEFAULT NULL,
  `systemstartused` FLOAT NULL DEFAULT NULL,
  `systemstartusers` INT(11) NULL DEFAULT NULL,
  UNIQUE INDEX `id` (`id` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 26621
DEFAULT CHARACTER SET = utf8;

USE `juddiv3` ;

-- -----------------------------------------------------
-- Table `juddiv3`.`j3_uddi_entity`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_uddi_entity` (
  `entity_key` VARCHAR(255) NOT NULL,
  `authorized_name` VARCHAR(255) NOT NULL,
  `created` DATETIME NULL DEFAULT NULL,
  `modified` DATETIME NOT NULL,
  `modified_including_children` DATETIME NULL DEFAULT NULL,
  `node_id` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`entity_key`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_business_entity`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_business_entity` (
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`entity_key`),
  INDEX `FKCA61A0CD1823CA5` (`entity_key` ASC),
  CONSTRAINT `FKCA61A0CD1823CA5`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_uddi_entity` (`entity_key`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_contact`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_contact` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `use_type` VARCHAR(255) NULL DEFAULT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK7551BEEABEB92A91` (`entity_key` ASC),
  CONSTRAINT `FK7551BEEABEB92A91`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_business_entity` (`entity_key`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_address` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `sort_code` VARCHAR(10) NULL DEFAULT NULL,
  `tmodel_key` VARCHAR(255) NULL DEFAULT NULL,
  `use_type` VARCHAR(255) NULL DEFAULT NULL,
  `address_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKF83236BE75D860FB` (`address_id` ASC),
  CONSTRAINT `FKF83236BE75D860FB`
    FOREIGN KEY (`address_id`)
    REFERENCES `juddiv3`.`j3_contact` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_address_line`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_address_line` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `key_name` VARCHAR(255) NULL DEFAULT NULL,
  `key_value` VARCHAR(255) NULL DEFAULT NULL,
  `line` VARCHAR(80) NOT NULL,
  `address_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKC665B8D5F8B8D8CF` (`address_id` ASC),
  CONSTRAINT `FKC665B8D5F8B8D8CF`
    FOREIGN KEY (`address_id`)
    REFERENCES `juddiv3`.`j3_address` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_auth_token`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_auth_token` (
  `auth_token` VARCHAR(51) NOT NULL,
  `authorized_name` VARCHAR(20) NOT NULL,
  `created` DATETIME NOT NULL,
  `last_used` DATETIME NOT NULL,
  `number_of_uses` INT(11) NOT NULL,
  `publisher_name` VARCHAR(255) NULL DEFAULT NULL,
  `token_state` INT(11) NOT NULL,
  PRIMARY KEY (`auth_token`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_business_service`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_business_service` (
  `entity_key` VARCHAR(255) NOT NULL,
  `business_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`entity_key`),
  INDEX `FK5D4255ACD1823CA5` (`entity_key` ASC),
  INDEX `FK5D4255ACEF04CFEE` (`business_key` ASC),
  CONSTRAINT `FK5D4255ACEF04CFEE`
    FOREIGN KEY (`business_key`)
    REFERENCES `juddiv3`.`j3_business_entity` (`entity_key`),
  CONSTRAINT `FK5D4255ACD1823CA5`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_uddi_entity` (`entity_key`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_binding_template`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_binding_template` (
  `access_point_type` VARCHAR(20) NULL DEFAULT NULL,
  `access_point_url` LONGTEXT NULL DEFAULT NULL,
  `hosting_redirector` VARCHAR(255) NULL DEFAULT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  `service_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`entity_key`),
  INDEX `FKD044BD6A2E448F3F` (`service_key` ASC),
  INDEX `FKD044BD6AD1823CA5` (`entity_key` ASC),
  CONSTRAINT `FKD044BD6AD1823CA5`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_uddi_entity` (`entity_key`),
  CONSTRAINT `FKD044BD6A2E448F3F`
    FOREIGN KEY (`service_key`)
    REFERENCES `juddiv3`.`j3_business_service` (`entity_key`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_category_bag`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_category_bag` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 186
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_binding_category_bag`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_binding_category_bag` (
  `id` BIGINT(20) NOT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `entity_key` (`entity_key` ASC),
  INDEX `FKCF34B2376A68D45A` (`id` ASC),
  INDEX `FKCF34B237CFBD88B7` (`entity_key` ASC),
  CONSTRAINT `FKCF34B237CFBD88B7`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_binding_template` (`entity_key`),
  CONSTRAINT `FKCF34B2376A68D45A`
    FOREIGN KEY (`id`)
    REFERENCES `juddiv3`.`j3_category_bag` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_binding_descr`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_binding_descr` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `descr` LONGTEXT NOT NULL,
  `lang_code` VARCHAR(5) NULL DEFAULT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK5EA60911CFBD88B7` (`entity_key` ASC),
  CONSTRAINT `FK5EA60911CFBD88B7`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_binding_template` (`entity_key`))
ENGINE = InnoDB
AUTO_INCREMENT = 105
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_business_category_bag`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_business_category_bag` (
  `id` BIGINT(20) NOT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `entity_key` (`entity_key` ASC),
  INDEX `FKD6D3ECB06A68D45A` (`id` ASC),
  INDEX `FKD6D3ECB0BEB92A91` (`entity_key` ASC),
  CONSTRAINT `FKD6D3ECB0BEB92A91`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_business_entity` (`entity_key`),
  CONSTRAINT `FKD6D3ECB06A68D45A`
    FOREIGN KEY (`id`)
    REFERENCES `juddiv3`.`j3_category_bag` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_business_descr`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_business_descr` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `descr` LONGTEXT NOT NULL,
  `lang_code` VARCHAR(5) NULL DEFAULT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK3A24B4B8BEB92A91` (`entity_key` ASC),
  CONSTRAINT `FK3A24B4B8BEB92A91`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_business_entity` (`entity_key`))
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_business_identifier`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_business_identifier` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `key_name` VARCHAR(255) NULL DEFAULT NULL,
  `key_value` VARCHAR(255) NOT NULL,
  `tmodel_key_ref` VARCHAR(255) NULL DEFAULT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKB0C7A652BEB92A91` (`entity_key` ASC),
  CONSTRAINT `FKB0C7A652BEB92A91`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_business_entity` (`entity_key`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_business_name`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_business_name` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `lang_code` VARCHAR(5) NULL DEFAULT NULL,
  `name` VARCHAR(255) NOT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK43F526F4BEB92A91` (`entity_key` ASC),
  CONSTRAINT `FK43F526F4BEB92A91`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_business_entity` (`entity_key`))
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_node`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_node` (
  `name` VARCHAR(255) NOT NULL,
  `custody_transfer_url` VARCHAR(255) NOT NULL,
  `factory_initial` VARCHAR(255) NULL DEFAULT NULL,
  `factory_naming_provider` VARCHAR(255) NULL DEFAULT NULL,
  `factory_url_pkgs` VARCHAR(255) NULL DEFAULT NULL,
  `inquiry_url` VARCHAR(255) NOT NULL,
  `juddi_api_url` VARCHAR(255) NULL DEFAULT NULL,
  `proxy_transport` VARCHAR(255) NOT NULL,
  `publish_url` VARCHAR(255) NOT NULL,
  `security_url` VARCHAR(255) NOT NULL,
  `subscription_url` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`name`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_clerk`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_clerk` (
  `clerk_name` VARCHAR(255) NOT NULL,
  `cred` VARCHAR(255) NULL DEFAULT NULL,
  `publisher_id` VARCHAR(255) NOT NULL,
  `node_name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`clerk_name`),
  INDEX `FK34DC7D9F6BB0F935` (`node_name` ASC),
  CONSTRAINT `FK34DC7D9F6BB0F935`
    FOREIGN KEY (`node_name`)
    REFERENCES `juddiv3`.`j3_node` (`name`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_client_subscriptioninfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_client_subscriptioninfo` (
  `subscription_key` VARCHAR(255) NOT NULL,
  `last_notified` DATETIME NULL DEFAULT NULL,
  `fromClerk_clerk_name` VARCHAR(255) NULL DEFAULT NULL,
  `toClerk_clerk_name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`subscription_key`),
  INDEX `FKDF04CC095BFC6733` (`fromClerk_clerk_name` ASC),
  INDEX `FKDF04CC09F3CE9C04` (`toClerk_clerk_name` ASC),
  CONSTRAINT `FKDF04CC09F3CE9C04`
    FOREIGN KEY (`toClerk_clerk_name`)
    REFERENCES `juddiv3`.`j3_clerk` (`clerk_name`),
  CONSTRAINT `FKDF04CC095BFC6733`
    FOREIGN KEY (`fromClerk_clerk_name`)
    REFERENCES `juddiv3`.`j3_clerk` (`clerk_name`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_contact_descr`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_contact_descr` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `descr` LONGTEXT NOT NULL,
  `lang_code` VARCHAR(5) NULL DEFAULT NULL,
  `contact_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK56CA9E6C2E3FD94F` (`contact_id` ASC),
  CONSTRAINT `FK56CA9E6C2E3FD94F`
    FOREIGN KEY (`contact_id`)
    REFERENCES `juddiv3`.`j3_contact` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_discovery_url`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_discovery_url` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `url` VARCHAR(255) NOT NULL,
  `use_type` VARCHAR(255) NOT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKA042FDAABEB92A91` (`entity_key` ASC),
  CONSTRAINT `FKA042FDAABEB92A91`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_business_entity` (`entity_key`))
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_email`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_email` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `email_address` VARCHAR(255) NOT NULL,
  `use_type` VARCHAR(255) NULL DEFAULT NULL,
  `contact_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK34F910E62E3FD94F` (`contact_id` ASC),
  CONSTRAINT `FK34F910E62E3FD94F`
    FOREIGN KEY (`contact_id`)
    REFERENCES `juddiv3`.`j3_contact` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_tmodel_instance_info`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_tmodel_instance_info` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `instance_parms` LONGTEXT NULL DEFAULT NULL,
  `tmodel_key` VARCHAR(255) NOT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKDC6C9004CFBD88B7` (`entity_key` ASC),
  CONSTRAINT `FKDC6C9004CFBD88B7`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_binding_template` (`entity_key`))
ENGINE = InnoDB
AUTO_INCREMENT = 90
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_instance_details_descr`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_instance_details_descr` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `descr` LONGTEXT NOT NULL,
  `lang_code` VARCHAR(5) NULL DEFAULT NULL,
  `tmodel_instance_info_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK3CC165902B115C6F` (`tmodel_instance_info_id` ASC),
  CONSTRAINT `FK3CC165902B115C6F`
    FOREIGN KEY (`tmodel_instance_info_id`)
    REFERENCES `juddiv3`.`j3_tmodel_instance_info` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_instance_details_doc_descr`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_instance_details_doc_descr` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `descr` LONGTEXT NOT NULL,
  `lang_code` VARCHAR(5) NULL DEFAULT NULL,
  `tmodel_instance_info_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK447324492B115C6F` (`tmodel_instance_info_id` ASC),
  CONSTRAINT `FK447324492B115C6F`
    FOREIGN KEY (`tmodel_instance_info_id`)
    REFERENCES `juddiv3`.`j3_tmodel_instance_info` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_keyed_reference_group`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_keyed_reference_group` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `tmodel_key` VARCHAR(255) NULL DEFAULT NULL,
  `category_bag_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKF6224ED41DB72652` (`category_bag_id` ASC),
  CONSTRAINT `FKF6224ED41DB72652`
    FOREIGN KEY (`category_bag_id`)
    REFERENCES `juddiv3`.`j3_category_bag` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_keyed_reference`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_keyed_reference` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `key_name` VARCHAR(255) NULL DEFAULT NULL,
  `key_value` VARCHAR(255) NOT NULL,
  `tmodel_key_ref` VARCHAR(255) NULL DEFAULT NULL,
  `category_bag_id` BIGINT(20) NULL DEFAULT NULL,
  `keyed_reference_group_id` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK350C8454E075C8D7` (`keyed_reference_group_id` ASC),
  INDEX `FK350C84541DB72652` (`category_bag_id` ASC),
  CONSTRAINT `FK350C84541DB72652`
    FOREIGN KEY (`category_bag_id`)
    REFERENCES `juddiv3`.`j3_category_bag` (`id`),
  CONSTRAINT `FK350C8454E075C8D7`
    FOREIGN KEY (`keyed_reference_group_id`)
    REFERENCES `juddiv3`.`j3_keyed_reference_group` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 227
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_tmodel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_tmodel` (
  `deleted` BIT(1) NULL DEFAULT NULL,
  `lang_code` VARCHAR(5) NULL DEFAULT NULL,
  `name` VARCHAR(255) NOT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`entity_key`),
  INDEX `FK83C8072BD1823CA5` (`entity_key` ASC),
  CONSTRAINT `FK83C8072BD1823CA5`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_uddi_entity` (`entity_key`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_overview_doc`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_overview_doc` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `overview_url` VARCHAR(255) NOT NULL,
  `overview_url_use_type` VARCHAR(255) NULL DEFAULT NULL,
  `entity_key` VARCHAR(255) NULL DEFAULT NULL,
  `tomodel_instance_info_id` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK5CD8D0E8C5BF8903` (`entity_key` ASC),
  INDEX `FK5CD8D0E8E8CE1B36` (`tomodel_instance_info_id` ASC),
  CONSTRAINT `FK5CD8D0E8E8CE1B36`
    FOREIGN KEY (`tomodel_instance_info_id`)
    REFERENCES `juddiv3`.`j3_tmodel_instance_info` (`id`),
  CONSTRAINT `FK5CD8D0E8C5BF8903`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_tmodel` (`entity_key`))
ENGINE = InnoDB
AUTO_INCREMENT = 73
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_overview_doc_descr`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_overview_doc_descr` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `descr` LONGTEXT NOT NULL,
  `lang_code` VARCHAR(5) NULL DEFAULT NULL,
  `overview_doc_id` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK36FB9EA9BDC711C` (`overview_doc_id` ASC),
  CONSTRAINT `FK36FB9EA9BDC711C`
    FOREIGN KEY (`overview_doc_id`)
    REFERENCES `juddiv3`.`j3_overview_doc` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_person_name`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_person_name` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `lang_code` VARCHAR(5) NULL DEFAULT NULL,
  `name` VARCHAR(255) NOT NULL,
  `contact_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKCB7B8AFF2E3FD94F` (`contact_id` ASC),
  CONSTRAINT `FKCB7B8AFF2E3FD94F`
    FOREIGN KEY (`contact_id`)
    REFERENCES `juddiv3`.`j3_contact` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_phone`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_phone` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `phone_number` VARCHAR(50) NOT NULL,
  `use_type` VARCHAR(255) NULL DEFAULT NULL,
  `contact_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK359202B82E3FD94F` (`contact_id` ASC),
  CONSTRAINT `FK359202B82E3FD94F`
    FOREIGN KEY (`contact_id`)
    REFERENCES `juddiv3`.`j3_contact` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_publisher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_publisher` (
  `authorized_name` VARCHAR(255) NOT NULL,
  `email_address` VARCHAR(255) NULL DEFAULT NULL,
  `is_admin` VARCHAR(5) NULL DEFAULT NULL,
  `is_enabled` VARCHAR(5) NULL DEFAULT NULL,
  `max_bindings_per_service` INT(11) NULL DEFAULT NULL,
  `max_businesses` INT(11) NULL DEFAULT NULL,
  `max_services_per_business` INT(11) NULL DEFAULT NULL,
  `max_tmodels` INT(11) NULL DEFAULT NULL,
  `publisher_name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`authorized_name`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_publisher_assertion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_publisher_assertion` (
  `from_key` VARCHAR(255) NOT NULL,
  `to_key` VARCHAR(255) NOT NULL,
  `from_check` VARCHAR(5) NOT NULL,
  `key_name` VARCHAR(255) NOT NULL,
  `key_value` VARCHAR(255) NOT NULL,
  `tmodel_key` VARCHAR(255) NOT NULL,
  `to_check` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`from_key`, `to_key`),
  INDEX `FK8A102449E3544929` (`to_key` ASC),
  INDEX `FK8A102449CCEE22D8` (`from_key` ASC),
  CONSTRAINT `FK8A102449CCEE22D8`
    FOREIGN KEY (`from_key`)
    REFERENCES `juddiv3`.`j3_business_entity` (`entity_key`),
  CONSTRAINT `FK8A102449E3544929`
    FOREIGN KEY (`to_key`)
    REFERENCES `juddiv3`.`j3_business_entity` (`entity_key`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_service_category_bag`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_service_category_bag` (
  `id` BIGINT(20) NOT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `entity_key` (`entity_key` ASC),
  INDEX `FK185A68076A68D45A` (`id` ASC),
  INDEX `FK185A680748D0656D` (`entity_key` ASC),
  CONSTRAINT `FK185A680748D0656D`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_business_service` (`entity_key`),
  CONSTRAINT `FK185A68076A68D45A`
    FOREIGN KEY (`id`)
    REFERENCES `juddiv3`.`j3_category_bag` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_service_descr`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_service_descr` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `descr` LONGTEXT NOT NULL,
  `lang_code` VARCHAR(5) NULL DEFAULT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKB6D63D4148D0656D` (`entity_key` ASC),
  CONSTRAINT `FKB6D63D4148D0656D`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_business_service` (`entity_key`))
ENGINE = InnoDB
AUTO_INCREMENT = 105
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_service_name`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_service_name` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `lang_code` VARCHAR(5) NULL DEFAULT NULL,
  `name` VARCHAR(255) NOT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKCC1BE94B48D0656D` (`entity_key` ASC),
  CONSTRAINT `FKCC1BE94B48D0656D`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_business_service` (`entity_key`))
ENGINE = InnoDB
AUTO_INCREMENT = 105
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_service_projection`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_service_projection` (
  `business_key` VARCHAR(255) NOT NULL,
  `service_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`business_key`, `service_key`),
  INDEX `FK629F290F2E448F3F` (`service_key` ASC),
  INDEX `FK629F290FEF04CFEE` (`business_key` ASC),
  CONSTRAINT `FK629F290FEF04CFEE`
    FOREIGN KEY (`business_key`)
    REFERENCES `juddiv3`.`j3_business_entity` (`entity_key`),
  CONSTRAINT `FK629F290F2E448F3F`
    FOREIGN KEY (`service_key`)
    REFERENCES `juddiv3`.`j3_business_service` (`entity_key`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_subscription`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_subscription` (
  `subscription_key` VARCHAR(255) NOT NULL,
  `authorized_name` VARCHAR(255) NOT NULL,
  `binding_key` VARCHAR(255) NULL DEFAULT NULL,
  `brief` BIT(1) NULL DEFAULT NULL,
  `create_date` DATETIME NOT NULL,
  `expires_after` DATETIME NULL DEFAULT NULL,
  `last_notified` DATETIME NULL DEFAULT NULL,
  `max_entities` INT(11) NULL DEFAULT NULL,
  `notification_interval` VARCHAR(255) NULL DEFAULT NULL,
  `subscription_filter` LONGTEXT NOT NULL,
  PRIMARY KEY (`subscription_key`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_subscription_chunk_token`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_subscription_chunk_token` (
  `chunk_token` VARCHAR(255) NOT NULL,
  `data` INT(11) NOT NULL,
  `end_point` DATETIME NULL DEFAULT NULL,
  `expires_after` DATETIME NOT NULL,
  `start_point` DATETIME NULL DEFAULT NULL,
  `subscription_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`chunk_token`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_subscription_match`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_subscription_match` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `entity_key` VARCHAR(255) NOT NULL,
  `subscription_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK5B9C2F19BEEE42E5` (`subscription_key` ASC),
  CONSTRAINT `FK5B9C2F19BEEE42E5`
    FOREIGN KEY (`subscription_key`)
    REFERENCES `juddiv3`.`j3_subscription` (`subscription_key`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_tmodel_category_bag`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_tmodel_category_bag` (
  `id` BIGINT(20) NOT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `entity_key` (`entity_key` ASC),
  INDEX `FK7E0859DB6A68D45A` (`id` ASC),
  INDEX `FK7E0859DBC5BF8903` (`entity_key` ASC),
  CONSTRAINT `FK7E0859DBC5BF8903`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_tmodel` (`entity_key`),
  CONSTRAINT `FK7E0859DB6A68D45A`
    FOREIGN KEY (`id`)
    REFERENCES `juddiv3`.`j3_category_bag` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_tmodel_descr`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_tmodel_descr` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `descr` LONGTEXT NOT NULL,
  `lang_code` VARCHAR(5) NULL DEFAULT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK63DFF1EDC5BF8903` (`entity_key` ASC),
  CONSTRAINT `FK63DFF1EDC5BF8903`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_tmodel` (`entity_key`))
ENGINE = InnoDB
AUTO_INCREMENT = 67
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_tmodel_identifier`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_tmodel_identifier` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `key_name` VARCHAR(255) NULL DEFAULT NULL,
  `key_value` VARCHAR(255) NOT NULL,
  `tmodel_key_ref` VARCHAR(255) NULL DEFAULT NULL,
  `entity_key` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKD5FB623DC5BF8903` (`entity_key` ASC),
  CONSTRAINT `FKD5FB623DC5BF8903`
    FOREIGN KEY (`entity_key`)
    REFERENCES `juddiv3`.`j3_tmodel` (`entity_key`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_tmodel_instance_info_descr`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_tmodel_instance_info_descr` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `descr` LONGTEXT NOT NULL,
  `lang_code` VARCHAR(5) NULL DEFAULT NULL,
  `tmodel_instance_info_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKD826B4062B115C6F` (`tmodel_instance_info_id` ASC),
  CONSTRAINT `FKD826B4062B115C6F`
    FOREIGN KEY (`tmodel_instance_info_id`)
    REFERENCES `juddiv3`.`j3_tmodel_instance_info` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_transfer_token`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_transfer_token` (
  `transfer_token` VARCHAR(51) NOT NULL,
  `expiration_date` DATETIME NOT NULL,
  PRIMARY KEY (`transfer_token`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `juddiv3`.`j3_transfer_token_keys`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `juddiv3`.`j3_transfer_token_keys` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `entity_key` VARCHAR(255) NULL DEFAULT NULL,
  `transfer_token` VARCHAR(51) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK8BBF49185ED9DD48` (`transfer_token` ASC),
  CONSTRAINT `FK8BBF49185ED9DD48`
    FOREIGN KEY (`transfer_token`)
    REFERENCES `juddiv3`.`j3_transfer_token` (`transfer_token`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
