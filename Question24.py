from flask import Flask, render_template,request
app = Flask(__name__)


@app.route("/", methods=['GET', 'POST'])
def form():
    if request.method == 'POST':
        n = request.form.get('name')
        email = request.form.get('email')
        un = request.form.get('username')
        pwd = request.form.get('password')
        cn = request.form.get('confirm')
        a = []
        a.append(n)
        a.append(email)
        a.append(un)
        print(a)
        return render_template('home.html', alert=a)
    return render_template("Form.html", alert="")


if __name__ == "__main__":
    app.run(debug=True, port=2021)

