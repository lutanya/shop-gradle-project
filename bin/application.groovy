dataSource {
    pooled = false
    driverClassName = "com.mysql.cj.jdbc.Driver"
    username = "root"
    password = "root"
}
environments {
    development {
        dataSource {
            dbCreate = "create-drop"
            url = "jdbc:mysql://localhost:3306/shoponline"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/shoponline"
        }
    }
    }