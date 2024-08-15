select * from bang1
CREATE TABLE bang1 (
    idCustomer INT PRIMARY KEY,
    name NVARCHAR(200),
    age NVARCHAR(200),
    address NVARCHAR(200)
);

CREATE TABLE bang2 (
    idHoaDon INT PRIMARY KEY,
    ngayDat DATE,
    idCustomer INT,
    FOREIGN KEY (idCustomer) REFERENCES bang1(idCustomer)
);
CREATE TABLE bang3 (
    idBoy INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(200),
    age NVARCHAR(200),
    address NVARCHAR(200)
);
CREATE TABLE bang3Log (
    logID INT IDENTITY(1,1) PRIMARY KEY,
    idBoy INT,
    name NVARCHAR(200),
    age NVARCHAR(200),
    address NVARCHAR(200),
    logDate DATETIME
);
/*them du lieu*/
INSERT INTO bang1 (name, age, address)
VALUES ('John Doe', '25', '123 Main St');
CREATE TABLE bang1 (
    idCustomer INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(200),
    age NVARCHAR(200),
    address NVARCHAR(200)
);

CREATE TABLE CustomerLog (
    logID INT IDENTITY(1,1) PRIMARY KEY,
    idCustomer INT,
    logMessage NVARCHAR(500),
    logDate DATETIME
);


/*function*/

CREATE FUNCTION getCustomerInfo (@idCustomer INT)
RETURNS TABLE
AS
RETURN 
(
    SELECT b1.idCustomer, b1.name, b1.age, b1.address
    FROM bang1 b1
    WHERE b1.idCustomer = @idCustomer
);
SELECT *FROM getCustomerInfo(1);  

/*trigger*/
CREATE TRIGGER triggerBang3
ON bang3
AFTER INSERT
AS
BEGIN
 
    INSERT INTO bang3Log (idBoy, name, age, address, logDate)
    SELECT i.idBoy, i.name, i.age, i.address, GETDATE()
    FROM INSERTED i;
END;
INSERT INTO bang3 (name, age, address)
VALUES ('John Doe', '30', '123 Main St');
SELECT *FROM bang3Log;

/*trigger update*/
CREATE TRIGGER triggerBang3Update
ON bang3
AFTER UPDATE
AS
BEGIN
    -- Ghi log các bản ghi được cập nhật vào bảng bang3
    INSERT INTO bang3Log (idBoy, name, age, address, logDate)
    SELECT i.idBoy, i.name, i.age, i.address, GETDATE()
    FROM INSERTED i
    INNER JOIN DELETED d ON i.idBoy = d.idBoy
    WHERE i.name <> d.name OR i.age <> d.age OR i.address <> d.address;
END;
UPDATE bang3
SET address = 'thuong tin'
WHERE name = 'Beo';

/*trigger delete*/
CREATE TRIGGER triggerBang3Delete
ON bang3
AFTER DELETE
AS
BEGIN
    -- Ghi log các bản ghi bị xóa từ bảng bang3
    INSERT INTO bang3Log (idBoy, name, age, address, logDate)
    SELECT d.idBoy, d.name, d.age, d.address, GETDATE()
    FROM DELETED d;
END;
delete bang3 where idBoy ='1'

/*selete top 3 */
select TOP 3 * from bang3
order by idBoy

/*DML: Là các lệnh để thao tác với dữ liệu trong bảng insert,select,update,delete*/
/*DDL: Là các lệnh để định nghĩa và thay đổi cấu trúc của các bảng và cơ sở dữ liệu create,alter,drop,truncate*/
/*UNION, UNION ALL, MINUS*/
SELECT idCustomer FROM bang1
UNION
SELECT idCustomer FROM bang2;

SELECT idCustomer FROM bang1
UNION ALL
SELECT idCustomer FROM bang2;

SELECT idCustomer FROM bang1
MINUS
SELECT idCustomer FROM bang2;

/*HAVING & WHERE
- WHERE dùng cho điều kiện trước GROUP BY
- HAVING dùng cho điều kiện sau GROUP BY*/
