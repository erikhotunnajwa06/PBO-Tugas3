# Deskripsi Tugas 
Tugas ini bertujuan untuk memahami dan menerapkan konsep-konsep dasar pemrograman berorientasi objek, yaitu abstract class, interface, method override, dan method overload. Saya membuat beberapa kelas abstract bertingkat dan interface yang merepresentasikan atribut dan perilaku manusia seperti identitas, pekerjaan, dan hobi. Selanjutnya, saya mengimplementasikan kelas konkret yang mewarisi abstract class dan mengimplementasikan interface tersebut. Selain itu, saya juga membuat contoh metode yang di-override dan di-overload untuk memperdalam pemahaman konsep pewarisan dan polimorfisme dalam OOP. Tugas ini diharapkan dapat meningkatkan kemampuan saya dalam merancang dan mengimplementasikan program berorientasi objek secara efektif.
# Abstract Class
Abstract Class adalah kelas yang tidak dapat diinstansiasi secara langsung dan biasanya berisi satu atau lebih method abstract (method yang hanya dideklarasikan tanpa implementasi). Abstract class dapat memiliki atribut dan metode yang sudah diimplementasikan. Kelas abstract berfungsi sebagai kerangka dasar yang harus diikuti oleh kelas turunannya dengan mengimplementasikan method-method abstract tersebut.
# Interface Class
Interface Class adalah kontrak murni yang hanya berisi deklarasi method tanpa implementasi (kecuali default method di Java 8+). Sebuah kelas dapat mengimplementasikan banyak interface sekaligus (multiple inheritance perilaku). Interface tidak dapat memiliki atribut instance, hanya konstanta.
# Perbedaan Abstract Class dan Interface Class
Interface digunakan untuk mendefinisikan perilaku yang harus diikuti oleh kelas yang mengimplementasikannya, dan sebuah kelas dapat mengimplementasikan banyak interface sekaligus, berbeda dengan pewarisan kelas abstract yang hanya satu jalur. 
Perbedaan utama antara class abstract dan interface terletak pada fleksibilitas dan tujuan penggunaannya: class abstract dapat memiliki atribut dan implementasi method, serta mendukung pewarisan tunggal, sedangkan interface hanya mendefinisikan method tanpa implementasi dan mendukung multiple inheritance perilaku.
# Override
Override terjadi ketika subclass mendefinisikan kembali metode yang sudah ada di superclass dengan tujuan untuk mengubah atau menambahkan fungsionalitas baru. Syarat override adalah metode di subclass harus memiliki nama, tipe return, dan parameter yang sama seperti di superclass. Override digunakan untuk mengimplementasikan atau memodifikasi perilaku yang diwarisi.
# Overload
Overload terjadi ketika beberapa metode dalam sebuah kelas memiliki nama yang sama, tetapi parameter yang berbeda (berbeda tipe data atau jumlah parameter). Metode-metode ini disebut overload satu sama lain. Ini digunakan ketika kita ingin memberikan berbagai cara untuk melakukan operasi yang sama.

