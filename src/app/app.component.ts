import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'OnlyFact';
  myForm: FormGroup;
  inputValues: string[] = [];

  constructor(private formBuilder: FormBuilder) {
    this.myForm = this.formBuilder.group({
      fact: ['', Validators.required]
    });
  }

  public onClick() {
    if (this.myForm.valid) {
      const inputValue = this.myForm.value.fact;
      this.inputValues.push(inputValue);
      this.myForm.reset();
    }
  }
}
