# AI-Powered Campus Assistant


An intelligent, unified mobile application designed to enhance the student experience at Ain Shams University. This graduation project integrates a state-of-the-art RAG chatbot for instant answers to university-related questions and a real-time AR navigation system for indoor guidance.

**Project Grade: A**

---

## 🎥 Project Demo

[Watch the full project demo video (8 minutes)](https://drive.google.com/file/d/1jcf5oVuCANPq5cFwk5MGbs9m-rHHMSkA/view?usp=sharing)

---

## ✨ Key Features

### 🤖 AI & Chatbot Core
- **Routed RAG (R-RAG) Architecture:** Employs an intelligent LLM router to dynamically select from domain-specific vector stores, eliminating context collision and dramatically improving response accuracy.
- **Optimized Information Retrieval:** Fine-tuned multiple sentence-transformer models (including `all-distilroberta-v1`) on a custom-generated, balanced dataset of over 5,700 question-answer pairs, significantly outperforming baseline models.
- **Stateful Conversational Memory:** The chatbot understands follow-up questions by referencing recent interaction history, allowing for natural, multi-turn dialogues.

### ⚙️ Backend & Infrastructure
- **Microservices Architecture:** A resilient backend utilizing **Python (FastAPI)** for the high-performance AI inference engine and **Java (Spring Boot & Spring Security)** for a secure, JWT-based authentication service.
- **Persistent, Multi-Session Chat System:** Architected with **MySQL**, enabling each user to create, save, and revisit an unlimited number of distinct, named conversations at any time.
- **Robust API Gateway:** Manages all client-server communication, ensuring a clean separation of concerns between the front-end and various backend services.

### 📱 AR Navigation & Mobile Front-End
- **Cross-Platform Mobile App:** Developed in **Unity (C#)** for a seamless user experience that unifies the AR and chatbot functionalities.
- **Real-time AR Navigation:** Uses AR Foundation to provide users with intuitive directional overlays on their camera feed, guiding them to campus destinations.
- **QR Code Positioning:** Employs a practical indoor positioning system that uses QR codes at key locations to initialize and recalibrate the user's position for accurate navigation.

---

## 🏛️ System Architecture

Our system uses a Routed-RAG architecture to ensure precise and efficient information retrieval. The LLM Router acts as the "brain," directing queries to the correct specialized knowledge store.

![System Architecture Diagram](https://github.com/B08DADY/Unified-AR-Navigation-Chatbot-Framework/blob/main/assets/Sysetem_Archi.png?raw=true)

---

## 🛠️ Tech Stack

- **AI & ML:** Python, PyTorch, Hugging Face Transformers, Sentence-Transformers, FastAPI, FAISS
- **Backend Services:** Java, Spring Boot, Spring Security, JWT, PostgreSQL
- **Mobile & AR:** Unity, C#, AR Foundation
- **DevOps & Tools:** Git, GitHub, Postman

---

## 🚀 Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites
- Unity Hub (with Android or iOS build support)
- Python 3.9+
- Java JDK 17+
- PostgreSQL Server

### Installation

1.  **Clone the repo:**
    ```sh
    git clone https://github.com/B08DADY/Unified-AR-Navigation-Chatbot-Framework.git
    cd Unified-AR-Navigation-Chatbot-Framework
    ```

2.  **Backend Setup (Java - Authentication):**
    - Navigate to the `auth-service` directory.
    - Configure your `application.properties` file with your PostgreSQL database credentials.
    - Build and run the Spring Boot application.

3.  **AI Backend Setup (Python - Chatbot):**
    - Navigate to the `chatbot-service` directory.
    - Install the required packages: `pip install -r requirements.txt`
    - Set up your environment variables (e.g., for any API keys used by the LLM).
    - Run the FastAPI server: `uvicorn main:app --reload`

4.  **Frontend Setup (Unity):**
    - Open the `unity-app` folder as a new project in Unity Hub.
    - In the project, locate the API manager script and update the base URLs to point to your local backend services (e.g., `http://localhost:8080` for auth, `http://localhost:8000` for the chatbot).
    - Run the application in the Unity Editor or build it to your mobile device.

---

## 🤝 Acknowledgments

- We extend our sincere gratitude to our project supervisors for their invaluable guidance and support throughout this research.
- Thanks to all our team members for their collaboration and dedication.
