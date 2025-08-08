from flask import Flask, render_template_string

app = Flask(__name__)

@app.route('/')
def home():
    return render_template_string("""
        <h2>Welcome</h2>
        <form action="/greet/Narasimha">
            <button type="submit">Greet Narasimha</button>
        </form>
    """)

@app.route('/greet/<name>')
def greet(name):
    return f'Hello, {name}!'

if __name__ == '__main__':
    app.run(debug=True)
