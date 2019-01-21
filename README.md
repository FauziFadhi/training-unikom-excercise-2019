# Soal praktek

1. Buatlah project dengan springboot untuk membuat aplikasi dengan tema e-commerce (Toko online)
2. Ketentuan minimal system yang harus di handle
    - Master data toko
    - Master data produk
    - Transaksi Penjualan (Flow transaksi bebas)
    - Master pelanggan

# Soal teori

1. Apa fungsi Hibernate ORM dan jelaskan mengapa?
	untuk menghubungkan Object dari sebuah kelas dengan object yang lain di bahasa Java
	
2. Jelaskan menurut pendapat anda dari beberapa fungsi annotation di hibernate seperti berikut:
    - ```@Entity 
		fungsi dari notation ini adalah untuk mengenali bahwa class tersebut adalah sebuah Entity atau model
    - ```@Table```
		fungsi dari notation ini adalah untuk memperkenalkan ke database bahwa class tersebut berhubungan dengan table yang mana
    - ```@Column```
		untuk mempernalkan atribute dari sebuah class berhubungan dengan column yang mana dengan properti yang bisa di tentukan
    - ```@OneToOne```
		Untuk mengenalkan bahwa object A(dimana notation dibuat) mempunyai relasi Onetoone ke object B, Contoh Object Kupon dan Manusia, 1 manusia hanya boleh 1 kode kupon
    - ```@ManyToOne```
		untuk mengenalkan bahwa object A(dimana notation dibuat) mempunyai relasi manyToOne ke Object B, Contoh Object Istri dengan Suami, banyak Istri di miliki banyak suami
    - ```@OneToMany
		untuk mengenalkan bahwa object A(dimana notation dibuat) mempunyai relasi manyToOne ke Object B, kebalikan dari contoh di atas
    - ```@JoinColumn
		untuk mengenalkan bahwa attribute yang di maksud adalah foreign key dari object
    - ```@JoinTable```
		untuk menghubungkan 2 Object dengan membuat sebuah table baru yang berbeda dari 2 object itu
    - ```@GeneratedValue```
		adalah sebuah notation yang digunakan untuk membuat sebuah nilai dengan pola yang khusus atau aturan yang khusus
3. Jelaskan menurut pendapat anda mengenai Dependency injection di springframework?
	Dependency Injection adalah sebuah process dimana object mengenalkan dependency yang ia butuh di sebuah tempat yang bernama constructor, sehingga bisa langsung digunakan saat object itu dibuat
4. Jelaskan menurut pendapat anda mengenai container / context di spring framework?
	container adalah sebuah tempat penampung yang digunakan tempat pendeklarasian Object dengan dependency yang mereka butuhkan
5. Jelaskan menurut pendapat anda fungsi dari beberapa fitur annotation di spring frameork seperti berikut:
    - ```@ComponentScan
		digunakan untuk memberitahu spring untuk mencari Component di sebuah package
    - ```@Autowired
		digunakan untuk depedency injection, yang mana sebuah classA membutuh property atau method yang di kelas B maka kelas B di autowired di class A
    - ```@Bean
		
    - ```@Component
		membuat class yang dituliskan @Component menjadi spring bean
    - ```@Repository
		di gunakan untuk pengelolaan database secara umum, agar pengkodean syntax bisa lebih sedikit, karna hanya ditulis sekali dan digunakan berulang
    - ```@Service```
		class yang digunakan untuk mengolah 2 model dari sebuah sistem sebelum digunakan di controller
    - ```@Controller```
		class yang digunakan untuk mengolah data dari 2 entitas, yang mana flow datanya dari luar sistem ke dalam sistem maupun sebaliknya
    - ```@RestController```
		membuat class yang di dalamnya di inisialisasi oleh function ini bisa di akses menggunakan route yang di buat
    - ```@RequestMapping
		membuat sebuah route untuk class yang di maksud
    - ```@GetMapping
	 	membuat function/method dibawahnya bisa di access dengan HTTP request method get dengan route yang dibuat developer, biasanya digunakan di API untuk mendapatkan data dari server
    - ```@PostMapping
		membuat function/method dibawahnya bisa di access dengan HTTP request method post dengan route yang dibuat developer, biasanya digunakan untuk menginput data dikarenakan data yang di input tidak tampil di URL jadi lebih aman
    - ```@PutMapping
		membuat function/method dibawahnya bisa di access dengan HTTP request method put dengan route yang dibuat developer, digunakan untuk mendapatkan data dan mengubah dengan menggunakan inputan parameter tertentu
    - ```@DeleteMapping
		membuat function/method dibawahnya bisa di access dengan HTTP request method delete dengan route yang dibuat developer dengan menggunakan parameter yang di input untuk menghapus data yang di maksud oleh parameter

## Cara mengerjakan

- Fork repository ini, kemudian setelah di fork, clone ke local komputer anda.
- Setelah selesai silahkan di push ke repository masing-masing.
- Selamat mengerjakan :) & good luck
