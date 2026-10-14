import tkinter as tk


class ProfileForm(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("Profile Form")
        self.geometry("500x500")
        self.minsize(450, 450)

        # Header
        header = tk.Frame(self, bg="navy")
        header.pack(fill="x")
        tk.Label(header, text="Profile Form", bg="navy", fg="white",
                 font=("Arial", 18, "bold")).pack(pady=15)

        # Form
        form = tk.Frame(self, padx=20, pady=20)
        form.pack(fill="both", expand=True)

        self.entries = {}
        rows = [
            ("Full Name:", "name"),
            ("Student ID:", "student_id"),
            ("Email:", "email"),
            ("Phone:", "phone"),
        ]
        for i, (label, key) in enumerate(rows):
            tk.Label(form, text=label).grid(row=i, column=0, sticky="e", padx=8, pady=6)
            e = tk.Entry(form, width=30)
            e.grid(row=i, column=1, sticky="ew", padx=8, pady=6)
            self.entries[key] = e

        # Address با Text
        tk.Label(form, text="Address:").grid(row=4, column=0, sticky="ne", padx=8, pady=6)
        self.address = tk.Text(form, height=4, width=30)
        self.address.grid(row=4, column=1, sticky="ew", padx=8, pady=6)

        form.columnconfigure(1, weight=1)

        # Status
        self.status = tk.Label(self, text="", fg="darkgreen")
        self.status.pack(pady=5)

        # Actions
        actions = tk.Frame(self, pady=10)
        actions.pack(fill="x")
        tk.Button(actions, text="Save", width=10, command=self.on_save).pack(side="left", padx=10)
        tk.Button(actions, text="Clear", width=10, command=self.on_clear).pack(side="left", padx=10)
        tk.Button(actions, text="Exit", width=10, command=self.destroy).pack(side="right", padx=10)

    def on_save(self):
        for key, entry in self.entries.items():
            print(f"{key}: {entry.get()}")
        print("address:", self.address.get("1.0", "end-1c"))
        self.status.config(text="Profile saved successfully")

    def on_clear(self):
        for entry in self.entries.values():
            entry.delete(0, tk.END)
        self.address.delete("1.0", tk.END)
        self.status.config(text="")
        self.entries["name"].focus_set()


if __name__ == "__main__":
    ProfileForm().mainloop()