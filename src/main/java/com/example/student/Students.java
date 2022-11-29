package com.example.student;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	@Entity
	public class Students {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		
		private int id;
		private int rollno;
		private String name;
		private int phoneno;
		
		public Students() {}
		
		public Students(int id, String name,int rollno,int phoneno) {
			this.setId(id);
			this.setName(name);
			this.setRollno(rollno);
			this.setPhoneno(phoneno);
		}
		
		
		public Students(String name, int phoneno) {
			this.setName(name);
			this.setPhoneno(phoneno);
		}
		
		
		public Students(int rollno, String name,int phoneno) {
			this.setRollno(rollno);
			this.setName(name);
			this.setPhoneno(phoneno);
		}
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public int getRollno() {
			return rollno;
		}


		public void setRollno(int rollno) {
			this.rollno = rollno;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getPhoneno() {
			return phoneno;
		}


		public void setPhoneno(int phoneno) {
			this.phoneno = phoneno;
		}
		
		
		@Override
		public String toString() {
			System.out.println("Students{" + "id=" + id +"," + "rollno=" + rollno +",name='"+ name +"'" +", phoneno='"+ phoneno + "'"+'}');
			return "Students{" + "id=" + id +"," + "rollno=" + rollno +",name='"+ name +"'" +", phoneno='"+ phoneno + "'"+'}';
		}	
	}
