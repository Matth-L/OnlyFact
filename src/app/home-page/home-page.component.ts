import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss']
})
export class HomePageComponent {
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
