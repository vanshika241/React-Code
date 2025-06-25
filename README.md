# 🧠 FaceOfficial – Age & Identity Verification System

FaceOfficial is a smart identity verification system that extracts age from Aadhaar and compares the Aadhaar photo with a live selfie to validate identity. It leverages OCR, face detection, and image analysis to give accurate and fast verification results.

---

## 🚀 Features

- 📄 **Aadhaar OCR & Age Extraction** – Extracts Date of Birth using OCR and calculates age.
- 🤳 **Live Selfie Capture** – Captures selfie directly in-browser using webcam.
- 🧠 **AI-Based Face Matching** – Compares Aadhaar photo with selfie using facial embeddings.
- ⚠️ **Image Quality Analysis** – Checks for blur, lighting, and warnings.
- 📊 **Confidence Score** – Returns similarity % and match/not matched verdict.
- 🖼 **1:1 Face Previews** – Cropped Aadhaar & selfie face images returned for display.

---

## 📦 Tech Stack

- ⚛️ **React** (with Vite) – Fast frontend framework for building user interfaces
- 🎨 **Tailwind CSS** – Utility-first CSS framework for styling
- 🧭 **React Router** – Handles client-side routing
- 📸 **React Webcam** – Captures live webcam feed for selfie verification
- 🔗 **Axios** – Handles HTTP requests to the backend

---


### 1. Clone the Repository
```bash
git clone https://github.com/your-username/FaceOfficial.git
```

### 2. Navigate to the Frontend Folder
```bash
cd frontend
```
### 3. Install Dependencies
```bash
npm install
```
### 4. Create a .env File (Optional)
```bash
VITE_BACKEND_URL=http://localhost:5000
```
### 5. Run the Development Server
```bash
npm run dev
```
Open your browser and visit:

http://localhost:5173


