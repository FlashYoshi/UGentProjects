class CreateEvents < ActiveRecord::Migration
  def change
    create_table :events do |t|
      t.string :title
      t.text :text
      t.datetime :start
      t.datetime :end

      t.timestamps
    end
  end
end
