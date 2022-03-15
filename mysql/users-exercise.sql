Last login: Tue Mar 15 11:28:11 on ttys001
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql-server start;
zsh: command not found: mysql-server
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql.server status
 ERROR! MySQL is not running
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql.server start
Starting MySQL
.. SUCCESS!
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql -u root -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE USER 'joe'@'localhost' IDENTIFIED BY 'joemama';
Query OK, 0 rows affected (0.03 sec)

mysql> SELECT user, host FROM mysql.user;
+------------------+-----------+
| user             | host      |
+------------------+-----------+
| joe              | localhost |
| mysql.infoschema | localhost |
| mysql.session    | localhost |
| mysql.sys        | localhost |
| root             | localhost |
| testUser         | localhost |
+------------------+-----------+
6 rows in set (0.01 sec)

mysql> exit;
Bye
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql -u joe -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 9
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> SELECT user, host FROM mysql.user;
ERROR 1142 (42000): SELECT command denied to user 'joe'@'localhost' for table 'user'
mysql> exit;
Bye
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql -u root -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 10
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> mysql> CREATE USER 'anne'@'localhost' IDENTIFIED BY 'raggedy';
Query OK, 0 rows affected (0.01 sec)

mysql> SELECT user, host mysql.user;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '.user' at line 1
mysql> SELECT user, host FROM mysql.user;
+------------------+------------------+
| user             | host             |
+------------------+------------------+
| joe              | localhost        |
| mysql.infoschema | localhost        |
| mysql.session    | localhost        |
| mysql.sys        | localhost        |
| root             | localhost        |
| testUser         | localhost        |
| anne             | localhostcalhost |
+------------------+------------------+
7 rows in set (0.00 sec)

mysql> DROP USER 'anne'@'localhostcalhost';
Query OK, 0 rows affected (0.01 sec)

mysql> SELECT user, host FROM mysql.user;
+------------------+-----------+
| user             | host      |
+------------------+-----------+
| joe              | localhost |
| mysql.infoschema | localhost |
| mysql.session    | localhost |
| mysql.sys        | localhost |
| root             | localhost |
| testUser         | localhost |
+------------------+-----------+
6 rows in set (0.00 sec)

mysql> DROP USER 'testUser'@'localhost';
Query OK, 0 rows affected (0.00 sec)

mysql> SELECT user, host FROM mysql.user;
+------------------+-----------+
| user             | host      |
+------------------+-----------+
| joe              | localhost |
| mysql.infoschema | localhost |
| mysql.session    | localhost |
| mysql.sys        | localhost |
| root             | localhost |
+------------------+-----------+
5 rows in set (0.00 sec)

mysql> CREATE USER 'anne'@'localhost' IDENTIFIED BY 'raggedy';
Query OK, 0 rows affected (0.01 sec)

mysql> SELECT user, host FROM mysql.user;
+------------------+-----------+
| user             | host      |
+------------------+-----------+
| anne             | localhost |
| joe              | localhost |
| mysql.infoschema | localhost |
| mysql.session    | localhost |
| mysql.sys        | localhost |
| root             | localhost |
+------------------+-----------+
6 rows in set (0.00 sec)

mysql> GRANT ALL ON *.* TO 'anne'@'localhost';
Query OK, 0 rows affected (0.01 sec)

mysql> exit;
Bye
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql -u anne -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 11
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> SELECT user, host FROM mysql.user;
+------------------+-----------+
| user             | host      |
+------------------+-----------+
| anne             | localhost |
| joe              | localhost |
| mysql.infoschema | localhost |
| mysql.session    | localhost |
| mysql.sys        | localhost |
| root             | localhost |
+------------------+-----------+
6 rows in set (0.00 sec)

mysql> CREATE USER 'sally'@'localhost';
Query OK, 0 rows affected (0.00 sec)

mysql> GRANT ALL ON *.* TO 'sally'@'localhost';
ERROR 1045 (28000): Access denied for user 'anne'@'localhost' (using password: YES)
mysql> exit;
Bye
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql -u root -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 12
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE USER 'jean'@'localhost' IDENTIFIED BY 'phoenix';
Query OK, 0 rows affected (0.01 sec)

mysql> GRANT SELECT ON *.* TO 'jean'@'localhost';
Query OK, 0 rows affected (0.01 sec)

mysql> exit;
Bye
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql -u jean -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 13
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> SELECT user, host FROM mysql.user;
+------------------+-----------+
| user             | host      |
+------------------+-----------+
| anne             | localhost |
| jean             | localhost |
| joe              | localhost |
| mysql.infoschema | localhost |
| mysql.session    | localhost |
| mysql.sys        | localhost |
| root             | localhost |
| sally            | localhost |
+------------------+-----------+
8 rows in set (0.01 sec)

mysql> CREATE USER 'mark'@'localhost';
ERROR 1227 (42000): Access denied; you need (at least one of) the CREATE USER privilege(s) for this operation
mysql> INSERT INTO mysql.user (Host, User) VALUES ('localhost', 'randal');
ERROR 1142 (42000): INSERT command denied to user 'jean'@'localhost' for table 'user'
mysql> exit;
Bye
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql -u root -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 14
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> DROP USER 'anne'@'localhost';
Query OK, 0 rows affected (0.01 sec)

mysql> DROP USER 'sally'@'localhost';
Query OK, 0 rows affected (0.01 sec)

mysql> DROP USER 'jean'@'localhost';
Query OK, 0 rows affected (0.00 sec)

mysql> DROP USER 'joe'@'localhost';
Query OK, 0 rows affected (0.00 sec)

mysql> SELECT user, host FROM mysql.user;
+------------------+-----------+
| user             | host      |
+------------------+-----------+
| mysql.infoschema | localhost |
| mysql.session    | localhost |
| mysql.sys        | localhost |
| root             | localhost |
+------------------+-----------+
4 rows in set (0.00 sec)

mysql> exitl
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'exitl' at line 1
mysql> exit;
Bye
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql.server status
 SUCCESS! MySQL running (2490)
kathrynrodriguez@Kathryns-MacBook-Air ~ % whoami
kathrynrodriguez
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql -u root -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 15
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE USER 'kathrynrodriguez'@'localhost' IDENTIFIED BY 'estinien87';
Query OK, 0 rows affected (0.02 sec)

mysql> GRANT ALL ON *.* 'kathrynrodriguez@'localhost' WITH GRANT OPTION;
    '> ;
'>
    '>
    '> ;
    '> exit;
'>
    '> '
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''kathrynrodriguez@'localhost' WITH GRANT OPTION;
;


;
exit;

'' at line 1
mysql> GRANT ALL ON *.* 'kathrynrodriguez'@'localhost' WITH GRANT OPTION;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''kathrynrodriguez'@'localhost' WITH GRANT OPTION' at line 1
mysql> GRANT ALL ON *.* TO 'kathrynrodriguez'@'localhost' WITH GRANT OPTION;
Query OK, 0 rows affected (0.00 sec)

mysql> exit;
Bye
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 16
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> SELECT current_user;
+----------------------------+
| current_user               |
+----------------------------+
| kathrynrodriguez@localhost |
+----------------------------+
1 row in set (0.00 sec)

mysql> exit;
Bye
kathrynrodriguez@Kathryns-MacBook-Air ~ % mysql.server stop;
Shutting down MySQL
. SUCCESS!
kathrynrodriguez@Kathryns-MacBook-Air ~ %
