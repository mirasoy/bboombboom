# MariaDB using Docker

- 설정

1. Docker container 생성

  - `my-secret-pw` 는 `root` 계정 비밀번호이므로 적절히 설정
  - `bboombboom` 은 Container 이름이므로 적절히 변경

```bash
docker pull mariadb
docker run --restart unless-stopped --name bboombboom -p 3306:3306 -e MARIADB_ROOT_PASSWORD=my-secret-pw -d mariadb:latest mariadb
```
2. Docker 접속

```bash
docker exec -it bboombboom bash
mariadb -uroot -p
```

3. Database and table 생성

  - `b4db`는 데이터베이스 이름
  - `b4user`는 사용자 계정 이름
  - `user-secret-pw`는 사용자 계정 비밀번호

```
CREATE DATABASE b4db;
CREATE USER IF NOT EXISTS b4user@b4db IDENTIFIED BY 'user-secret-pw';
SHOW WARNINGS;
GRANT ALL PRIVILEGES ON b4db.* TO 'b4user'@'%' IDENTIFIED BY 'user-secret-pw';
FLUSH PRIVILEGES;
```

4. DB Connector 활용 데이터베이스 접근 및 활용

