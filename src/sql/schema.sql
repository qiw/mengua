



-- ---
-- Globals
-- ---

-- SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
-- SET FOREIGN_KEY_CHECKS=0;

-- ---
-- Table 'user'
-- 
-- ---

DROP TABLE IF EXISTS `media`;
DROP TABLE IF EXISTS `like`;
DROP TABLE IF EXISTS `snippet`;
DROP TABLE IF EXISTS `user_game`;
DROP TABLE IF EXISTS `game`;
DROP TABLE IF EXISTS `token`;
DROP TABLE IF EXISTS `user`;
    
CREATE TABLE `user` (
  `user_id` BIGINT NOT NULL AUTO_INCREMENT,
  `display_name` VARCHAR(512) NOT NULL,
  `email` VARCHAR(512) NOT NULL,
  `profile_image_url` VARCHAR(2083) NULL DEFAULT NULL,
  `password` VARCHAR(1024) NOT NULL,
  `gender` VARCHAR(512) NOT NULL,
  `birthday` DATETIME NULL DEFAULT NULL,
  `place` VARCHAR(512) NULL DEFAULT NULL,
  `description` VARCHAR(1024) NULL DEFAULT NULL,
  `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`)
);

-- ---
-- Table 'game'
-- 
-- ---


CREATE TABLE `game` (
  `game_id` BIGINT NOT NULL AUTO_INCREMENT,
  `description` MEDIUMTEXT NULL DEFAULT NULL,
  `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`game_id`)
);

-- ---
-- Table 'user_game'
-- 
-- ---

    
CREATE TABLE `user_game` (
  `user_game_id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT NOT NULL,
  `game_id` BIGINT NOT NULL,
  `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_game_id`)
);

-- ---
-- Table 'snippet'
-- 
-- ---

    
CREATE TABLE `snippet` (
  `snippet_id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT NOT NULL,
  `in_reply_to_id` BIGINT NOT NULL,
  `post` MEDIUMTEXT NULL DEFAULT NULL,
  `lang` VARCHAR(128) NOT NULL DEFAULT 'EN',
  `place` VARCHAR(1024) NULL DEFAULT NULL,
  `longitude` DOUBLE NULL DEFAULT NULL,
  `latitude` DOUBLE NULL DEFAULT NULL,
  `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`snippet_id`)
);

-- ---
-- Table 'like'
-- 
-- ---

CREATE TABLE `like` (
  `like_id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT NOT NULL,
  `target_id` BIGINT NOT NULL,
  `like_type` VARCHAR(128) NOT NULL,
  `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`like_id`)
);

-- ---
-- Table 'token'
-- 
-- ---

    
CREATE TABLE `token` (
  `token_id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT NOT NULL,
  `context` MEDIUMTEXT NULL DEFAULT NULL,
  `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`token_id`)
);

-- ---
-- Table 'follow'
-- 
-- ---

-- DROP TABLE IF EXISTS `follow`;
--    
-- CREATE TABLE `follow` (
--  `follow_id` BIGINT NOT NULL,
--  `follower_id` BIGINT NOT NULL,
--  `followee_id` BIGINT NOT NULL,
--  `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
--  `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
--  PRIMARY KEY (`follow_id`)
-- );

-- ---
-- Table 'media'
-- 
-- ---

    
CREATE TABLE `media` (
  `media_id` BIGINT NOT NULL AUTO_INCREMENT,
  `snippet_id` BIGINT NOT NULL,
  `media_url` VARCHAR(2083) NULL DEFAULT NULL,
  `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`media_id`)
);

-- ---
-- Foreign Keys 
-- ---

ALTER TABLE `user_game` ADD FOREIGN KEY (user_id) REFERENCES `user` (`user_id`);
ALTER TABLE `user_game` ADD FOREIGN KEY (game_id) REFERENCES `game` (`game_id`);
ALTER TABLE `snippet` ADD FOREIGN KEY (user_id) REFERENCES `user` (`user_id`);
ALTER TABLE `snippet` ADD FOREIGN KEY (in_reply_to_id) REFERENCES `snippet` (`snippet_id`);
ALTER TABLE `like` ADD FOREIGN KEY (user_id) REFERENCES `user` (`user_id`);
ALTER TABLE `token` ADD FOREIGN KEY (user_id) REFERENCES `user` (`user_id`);
-- ALTER TABLE `follow` ADD FOREIGN KEY (follower_id) REFERENCES `user` (`user_id`);
-- ALTER TABLE `follow` ADD FOREIGN KEY (followee_id) REFERENCES `user` (`user_id`);
ALTER TABLE `media` ADD FOREIGN KEY (snippet_id) REFERENCES `snippet` (`snippet_id`);

-- ---
-- Table Properties
-- ---

-- ALTER TABLE `user` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `game` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `user_game` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `snippet` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `like` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `token` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `follow` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `media` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ---
-- Test Data
-- ---

-- INSERT INTO `user` (`user_id`,`display_name`,`email`,`profile_image_url`,`password`,`created_at`,`updated_at`) VALUES
-- ('','','','','','','');
-- INSERT INTO `game` (`game_id`,`desc`,`created_at`,`updated_at`) VALUES
-- ('','','','');
-- INSERT INTO `user_game` (`user_game_id`,`user_id`,`game_id`,`created_at`,`updated_at`) VALUES
-- ('','','','','');
-- INSERT INTO `snippet` (`snippet_id`,`user_id`,`in_reply_to_id`,`post`,`lang`,`place`,`longitude`,`latitude`,`created_at`,`updated_at`) VALUES
-- ('','','','','','','','','','');
-- INSERT INTO `like` (`like_id`,`user_id`,`snippet_id`,`created_at`,`updated_at`) VALUES
-- ('','','','','');
-- INSERT INTO `token` (`token_id`,`user_id`,`context`,`created_at`,`updated_at`) VALUES
-- ('','','','','');
-- INSERT INTO `follow` (`follow_id`,`follower_id`,`followee_id`,`created_at`,`updated_at`) VALUES
-- ('','','','','');
-- INSERT INTO `media` (`media_id`,`snippet_id`,`media_url`,`created_at`,`updated_at`) VALUES
-- ('','','','','');


