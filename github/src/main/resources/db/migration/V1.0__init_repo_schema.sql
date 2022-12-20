CREATE TABLE `t_ds_user`
(
    id     int PRIMARY KEY,
    login  varchar(20) NOT NULL UNIQUE,
    avatar text

);


CREATE TABLE `t_ds_repository`
(
    id          int PRIMARY KEY,
    name        VARCHAR(30) NOT NULL UNIQUE ,
    description text
);

CREATE TABLE `t_rel_repo_contributor`
(
    repo     int NOT NULL,
    contributor int NOT NULL,

    CONSTRAINT `fk__rel_repo_contributor__repo` FOREIGN KEY (`repo`) REFERENCES `t_ds_repository` (`id`) ON DELETE CASCADE,
    CONSTRAINT `fk__rel_repo_contributor__contributor` FOREIGN KEY (`contributor`) REFERENCES `t_ds_user` (`id`) ON DELETE CASCADE,
    CONSTRAINT `uniq__rel_repo_contributor__record` UNIQUE (`repo`, `contributor`)
);

CREATE TABLE `t_ds_issue`
(
    id          varchar(50) PRIMARY KEY,
    repo        int NOT NULL,
    display     int NOT NULL,
    title       text NOT NULL,
    description longtext,
    comments    text,
    closed      bool NOT NULL DEFAULT FALSE,
    createat   bigint NOT NULL,
    close       bigint,

    CONSTRAINT `fk__ds_issue__repo` FOREIGN KEY (`repo`) REFERENCES `t_ds_repository` (`id`) ON DELETE CASCADE,
    CONSTRAINT `uniq__ds_issue__display_id` UNIQUE (`repo`, `display`)
);

CREATE TABLE `t_ds_commit`
(
    id          int PRIMARY KEY AUTO_INCREMENT,
    sha         varchar(40) NOT NULL,
    repo        int NOT NULL,

    html        text NOT NULL,
    author      text NOT NULL,
    commit_at   bigint NOT NULL,

    CONSTRAINT `fk__ds_commit__repo` FOREIGN KEY (`repo`) REFERENCES `t_ds_repository` (`id`) ON DELETE CASCADE

);

CREATE TABLE `t_ds_release`
(
    id          int PRIMARY KEY AUTO_INCREMENT  ,
    repo        int NOT NULL,
    display     int NOT NULL,
    tag         varchar(50) NOT NULL,
    createat   bigint NOT NULL,

    CONSTRAINT `fk__ds_release__repo` FOREIGN KEY (`repo`) REFERENCES `t_ds_repository` (`id`) ON DELETE CASCADE,
    CONSTRAINT `uniq__ds_release__display_id` UNIQUE (`repo`, `display`)

);
