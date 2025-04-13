# java-rest-api
 
# API Endpoints

The API is hosted locally at `http://localhost:8080`. You can access the following endpoints:

## 1. Sum
**Endpoint:** `GET /sum`

**Query Parameters:**
- `a` — first number (required)
- `b` — second number (required)

**Example Request:**
```http
GET /sum?a=1&b=2 HTTP/1.1
Host: localhost:8080
Accept: application/json
```

**Response:**
```json
3
```

---

## 2. Subtract
**Endpoint:** `GET /subtract`

**Query Parameters:**
- `a` — minuend (required)
- `b` — subtrahend (required)

**Example Request:**
```http
GET /subtract?a=5&b=3 HTTP/1.1
Host: localhost:8080
Accept: application/json
```

**Response:**
```json
2
```

---

## 3. Multiply
**Endpoint:** `GET /multiply`

**Query Parameters:**
- `a` — first number (required)
- `b` — second number (required)

**Example Request:**
```http
GET /multiply?a=3&b=4 HTTP/1.1
Host: localhost:8080
Accept: application/json
```

**Response:**
```json
12
```

---

## 4. Divide
**Endpoint:** `GET /divide`

**Query Parameters:**
- `a` — dividend (required)
- `b` — divisor (required, must not be zero)

**Example Request:**
```http
GET /divide?a=10&b=3 HTTP/1.1
Host: localhost:8080
Accept: application/json
```

**Response:**
```json
3.3333333333
```

**Note:** If `b = 0`, the API will return an error: `"Cannot divide by zero"`.

