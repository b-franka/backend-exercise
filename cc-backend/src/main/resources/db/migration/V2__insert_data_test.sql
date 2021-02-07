-- insert users test data
INSERT INTO cc.users (id, location, first_name, last_name)
VALUES (1, 'Budapest', 'Maci', 'Laci'),
       (2, 'Budapest', 'Kala', 'Pali'),
       (3, 'Budapest', 'Édes', 'Anna'),
       (4, 'Miskolc', 'Erős', 'Pista'),
       (5, 'Budapest', 'Erős', 'Pista2'),
       (6, 'Budapest', 'Erős', 'Pista3'),
       (7, 'Miskolc', 'Erős', 'Pista4'),
       (8, 'Budapest', 'Erős', 'Pista5'),
       (9, 'Miskolc', 'Erős', 'Pista6'),
       (10, 'Budapest', 'Cserepes', 'Virág');

-- insert teams test data
INSERT INTO cc.team (id, title, url)
VALUES (1, 'mafla', 'https://codecool.com/hu/'),
       (2, 'girhes', 'https://codecool.com/hu/'),
       (3, 'thebuggers', 'https://codecool.com/hu/'),
       (4, 'backstreet boys', 'https://codecool.com/hu/'),
       (5, 'cryptowombats', 'https://codecool.com/hu/');

-- insert projects test data
INSERT INTO cc.project (id, title, url, created_at, team_id)
VALUES (1, 'It''s a trap', 'https://www.youtube.com/watch/4F4qzPbcFiA', '2021-02-01', 1),
(2, 'Rickrolling everyone on the planet','https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstleyVEVO','2021-02-02',2),
(3, 'Learn tons of angular','https://www.udemy.com/topic/angular/','2021-02-03',3),
(4, 'Learn some COBOL','https://www.udemy.com/course/mainframe-the-complete-cobol-course-from-beginner-to-expert/','2021-02-01',2),
(5, 'Learning how to learn','https://www.coursera.org/learn/learning-how-to-learn','2021-02-05',1),
(6, 'Wasting time on the internet','https://www.english.upenn.edu/courses/undergraduate/2015/spring/engl111.301','2021-02-06',4),
(7, 'Entertainment Engineering and Design','https://www.unlv.edu/degree/bs-entertainment-engineering-design','2021-02-07',3),
(8, 'Peace and conflict studies','https://www.uu.se/en/admissions/master/selma/program/?pKod=SFK2M','2021-02-07',5);

-- insert technology test data
INSERT INTO cc.technology (id, title)
VALUES (1, 'Java'),
       (2, 'Python'),
       (3, 'SQL'),
       (4, 'COBOL'),
       (5, 'Mindfuck'),
       (6, 'Assembly'),
       (7, 'Perl'),
       (8, 'C'),
       (9, 'R'),
       (10, 'F#'),
       (11, 'Ruby'),
       (12, 'Haskell'),
       (13, 'Rust'),
       (14, 'Microsoft Word'),
       (15, 'NANO'),
       (16, 'Vim');

-- insert tech xp per user test data
INSERT INTO cc.technology_to_user (experience_point, technology_id, user_id)
VALUES (10, 1, 1),
       (3, 10, 1),
       (22, 5, 1),
       (2, 1, 2),
       (11, 3, 2),
       (56, 6, 2),
       (66, 15, 2),
       (1, 3, 3),
       (13, 4, 3),
       (2, 13, 3),
       (15, 5, 3),
       (5, 8, 3),
       (32, 9, 3),
       (25, 10, 3),
       (13, 11, 3),
       (16, 12, 3),
       (6, 12, 4),
       (2, 11, 4),
       (10, 3, 4),
       (9, 1, 5),
       (83, 4, 5),
       (75, 7, 5),
       (16, 12, 5),
       (65, 14, 5),
       (10, 16, 5),
       (32, 9, 6),
       (25, 10, 6),
       (11, 11, 7),
       (16, 12, 2),
       (6, 12, 7),
       (2, 11, 8),
       (1, 3, 9),
       (99, 1, 9),
       (89, 4, 10),
       (7, 7, 9),
       (14, 12, 8),
       (6, 14, 7),
       (11, 16, 9),
       (10, 2, 6);

-- insert user to team test data
INSERT INTO cc.user_to_team (user_id, team_id)
VALUES (1, 1),
       (1, 3),
       (2, 1),
       (2, 4),
       (3, 5),
       (4, 1),
       (5, 1),
       (5, 2),
       (6, 3),
       (7, 4),
       (8, 5),
       (9, 5),
       (10, 2);

