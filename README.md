# jpa-study
자바 ORM 표준 JPA 프로그래밍 - 기본편

# install h2
brew install h2
~brew services start h2~
~brew services stop h2~
h2
http://localhost:8082

Generic H2 (Server)로 설정하고 JDBC URL을 jdbc:h2:~/test로 파일 모드로 설정하여 연결 버튼

jdbc:h2:~/test

생성 후 jdbc:h2:tcp://localhost/~/test

# Create Table
```sql
create table Member (
 id bigint not null,
 name varchar(255),
 primary key (id)
);
```
