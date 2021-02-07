CREATE SCHEMA cc;

CREATE TABLE IF NOT EXISTS cc.users (
    id INTEGER,
    location VARCHAR (100) NOT NULL,
    first_name VARCHAR (32) NOT NULL,
    last_name VARCHAR (32) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS cc.team (
    id INTEGER,
    title VARCHAR (100) NOT NULL,
    url VARCHAR (255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS cc.project (
    id INTEGER,
    title VARCHAR (100) NOT NULL,
    url VARCHAR (255) NOT NULL,
    created_at DATE NOT NULL,
    team_id INTEGER,
    PRIMARY KEY (id),
    CONSTRAINT fk_team_project_team_id
        FOREIGN KEY(team_id)
        REFERENCES cc.team(id)
);

CREATE TABLE IF NOT EXISTS cc.technology (
    id INTEGER,
    title VARCHAR (100),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS cc.user_to_team (
    user_id INTEGER,
    team_id INTEGER,
    PRIMARY KEY (user_id, team_id),
    CONSTRAINT fk_users_user_to_team_user_id
        FOREIGN KEY(user_id)
        REFERENCES cc.users(id),
    CONSTRAINT fk_project_user_to_team_team_id
        FOREIGN KEY(team_id)
        REFERENCES cc.team(id)
);

CREATE TABLE IF NOT EXISTS cc.technology_to_user (
    experience_point INT,
    technology_id INT,
    user_id INT,
    PRIMARY KEY (technology_id, user_id),
    CONSTRAINT fk_technogy_technology_to_user_technology_id
        FOREIGN KEY(technology_id)
        REFERENCES cc.technology(id),
    CONSTRAINT fk_users_technology_to_user_user_id
        FOREIGN KEY(user_id)
        REFERENCES cc.users(id)
);
