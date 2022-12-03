/*#define PICO_DEFAULT_LED_PIN 25*/
void setup() {
  // put your setup code here, to run once:
const uint LED_PIN = PICO_DEFAULT_LED_PIN;
gpio_init(LED_PIN);
gpio_set_dir(LED_PIN, GPIO_OUT);
}

void loop() {
  // put your main code here, to run repeatedly:
gpio_put(LED_PIN, 1);
sleep_ms(250);
gpio_put(LED_PIN, 0);
sleep_ms(250)
}
