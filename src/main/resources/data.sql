
//order of insertion is important due to foreign key constraint in student table(see addressId column in student.java) 
insert into address (addressId, fullAddress, city, country ) values (1, 'A NAGAR', 'ATP', 'India')
insert into address (addressId, fullAddress, city, country ) values (2, 'P NAGAR', 'BLRY', 'India')
insert into address (addressId, fullAddress, city, country ) values (3, 'P PUR', 'ST', 'India')
insert into address (addressId, fullAddress, city, country ) values (4, 'MN PALLI', 'KLD', 'India')
insert into address (addressId, fullAddress, city, country ) values (5, 'K THOTA', 'BLRY', 'India')
insert into address (addressId, fullAddress, city, country ) values (6, 'MARATHALLI', 'BLR', 'India')

insert into student (studentId, studentName, addressId) values (1, 'H', 1)
insert into student (studentId, studentName, addressId) values (2, 'K', 2)
insert into student (studentId, studentName, addressId) values (3, 'N', 3)
insert into student (studentId, studentName, addressId) values (4, 'M', 4)
insert into student (studentId, studentName, addressId) values (5, 'G', 5)
insert into student (studentId, studentName, addressId) values (6, 'R', 6)


